import React, { useEffect, useRef, useState } from 'react';
import styled from 'styled-components';
import BottomNav from '../../../components/Common/BottomNav';
import Header from '../../../components/Common/Header';
import TextArea from '../../../components/Common/TextArea';
import Button from '../../../components/Common/Button';
import Image from '../../../components/Common/Image';
import { useLocation, useNavigate } from 'react-router';
import { MyRoutine, SnsFeedListRoutine } from '../../../lib/api/sns-api';
import { SnsFeedWrite } from '../../../lib/api/sns-api';
import { SnsFeedModify } from '../../../lib/api/sns-api';

const s = {
  Container: styled.section`
    height: 100%;
    background-color: ${(props) => props.theme.bgColor};
  `,
  HeaderArea: styled.div`
    position: relative;
    z-index: 1000;
  `,
  MainArea: styled.div`
    padding: 57px 0 150px;
    overflow: auto;
  `,
  Routine: styled.div`
    color: ${(props) => props.theme.textColor};
    font-size: 80%;
    font-weight: 600;
    text-shadow: 1px 1px 1px black;
  `,

  ImageArea: styled.div`
    position: relative;
    width: 100%;
    aspect-ratio: 1;
    display: flex;
    align-items: center;
  `,
  FeedImage: styled.div<ImageAreaProps>`
    width: 100%;
    margin: 0 auto;
    display: ${(props) => (props.$isRoutine === true ? 'none' : '')};
  `,
  FeedRoutine: styled.div<ImageAreaProps>`
    width: 100%;
    height: 100%;
    display: ${(props) => (props.$isRoutine === true ? '' : 'none')};
    overflow-y: auto;
  `,
  RoutineArea: styled.div`
    line-height: 150%;
    margin: 40px;
  `,
  SelectPicture: styled.div`
    display: flex;
    justify-content: space-between;
    margin: 15px 0;
    padding: 0 25px 0 25px;
  `,
  Button: styled.div`
    display: flex;
    width: 100%;
    max-width: 800px;
    padding: 0 25px;
    position: fixed;
    bottom: 88px;
  `,
};

interface ImageAreaProps {
  $isRoutine: boolean;
}

type routineData = {
  id: number;
  details: [
    {
      exerciseName: string;
      setCount: number;
    },
  ];
};

const UpdateFeedPage = (): JSX.Element => {
  const navigate = useNavigate();
  const handleMovePage = (): void => {
    navigate('/sns');
  };

  //수정 전 정보 가져오기
  const [targetFeedId, setTargetFeedId] = useState();
  const [routineId, setRoutineId] = useState();
  const location = useLocation();

  useEffect(() => {
    if (location.state !== null) {
      setTargetFeedId(location.state.targetFeedId);
      setContentValue(location.state.feedContent.content);
      setimgurl(
        `https://i11b310.p.ssafy.io/images/${location.state.feedContent.image.split('/home/ubuntu/images/')[1]}`,
      );
      setRoutineId(location.state.feedContent.routineId);
    }
  }, [targetFeedId]);

  // 루틴 확인, 사진 확인 전환
  const [isRoutineMode, setIsRoutineMode] = useState(false);

  const routineButtonOnClick = () => {
    setIsRoutineMode((prev) => !prev);
  };

  // 파일 업로드하기 (image)
  const fileInputRef = useRef<HTMLInputElement>(null);
  const [image, setImage] = useState<string>();
  const [changeImg, setChangeImg] = useState<File>();
  const [imgurl, setimgurl] = useState<string>();

  const handleImageUpload = (e: React.ChangeEvent<HTMLInputElement>) => {
    if (e.target.files && e.target.files.length > 0) {
      const newFilesArray = Array.from(e.target.files);
      const file = e.target.files?.[0];
      if (file) {
        const reader = new FileReader();
        reader.onload = () => {
          setImage(reader.result as string);
          setimgurl(URL.createObjectURL(file));
        };
        setChangeImg(newFilesArray[0]);
        reader.readAsDataURL(file);
      }
    }
  };

  useEffect(() => {}, [image]);

  // 내 루틴 가져오기
  const [routine, setRoutine] = useState<routineData>();

  const getRoutineData = async () => {
    if (targetFeedId) {
      await SnsFeedListRoutine(
        targetFeedId,
        (resp) => {
          setRoutine(resp.data);
        },
        (error) => {
          console.error(error);
        },
      );
    }
  };

  useEffect(() => {
    getRoutineData();
  }, [targetFeedId]);

  // 피드 내용 작성
  const [contentValue, setContentValue] = useState('');

  const contentOnChange = (event: React.FormEvent<HTMLTextAreaElement>) => {
    const {
      currentTarget: { value },
    } = event;
    setContentValue(value);
  };

  const feedOnSubmit = async (event: React.FormEvent<HTMLButtonElement>) => {
    if (routine !== undefined && targetFeedId !== undefined) {
      // if (changeImg !== undefined && routine !== undefined && targetFeedId !== undefined) {
      const formData = new FormData();
      const feedContent = {
        content: contentValue,
        routineId: routine.id,
      };
      formData.append('feed', new Blob([JSON.stringify(feedContent)], { type: 'application/json' }));
      if (changeImg !== undefined) {
        formData.append('image', changeImg);
      }
      await SnsFeedModify(
        targetFeedId,
        formData,
        (resp) => {
          handleMovePage();
        },
        (error) => {
          console.error(error);
        },
      );
    }
  };

  return (
    <>
      <s.Container>
        <s.HeaderArea>
          <Header text="운동 피드 수정" />
        </s.HeaderArea>
        <s.MainArea>
          <s.ImageArea>
            <s.FeedImage $isRoutine={isRoutineMode}>
              <Image width="100%" height="100%" src={imgurl} type="rect" />
            </s.FeedImage>
            <s.FeedRoutine $isRoutine={isRoutineMode}>
              <s.RoutineArea>
                {routine?.details?.map((item) => (
                  <>
                    <s.Routine>
                      {item.exerciseName} {item.setCount}세트
                    </s.Routine>
                  </>
                ))}
              </s.RoutineArea>
            </s.FeedRoutine>
          </s.ImageArea>
          <s.SelectPicture>
            <Button
              width="49%"
              height="40px"
              size="14px"
              bold="500"
              children="사진 선택"
              onClick={() => {
                fileInputRef.current?.click();
              }}
            />
            <input
              ref={fileInputRef}
              type="file"
              accept="image/*"
              multiple
              style={{ display: 'none' }}
              onChange={handleImageUpload}
            />
            {isRoutineMode ? (
              <Button
                width="49%"
                height="40px"
                size="14px"
                bold="500"
                children="사진 확인"
                onClick={routineButtonOnClick}
              />
            ) : (
              <Button
                width="49%"
                height="40px"
                size="14px"
                bold="500"
                children="루틴 확인"
                onClick={routineButtonOnClick}
              />
            )}
          </s.SelectPicture>
          <TextArea
            width="90%"
            height="180px"
            margin="0 auto"
            display="block"
            onChange={contentOnChange}
            value={contentValue}
          />
        </s.MainArea>
        <s.Button>
          <Button
            width="100%"
            height="40px"
            size="14px"
            type="main"
            bold="500"
            children="작성완료"
            onClick={feedOnSubmit}
          />
        </s.Button>
      </s.Container>
      <BottomNav />
    </>
  );
};

export default UpdateFeedPage;
