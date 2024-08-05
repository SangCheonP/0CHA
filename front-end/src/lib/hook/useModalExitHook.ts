import { useEffect } from 'react';
import { useAppDispatch, useAppSelector } from './useReduxHook';
import { modalActions, selectModalCalendar } from '../../store/modal';

export const useModalExitHook = (): void => {
  const dispatch = useAppDispatch();
  useEffect(() => {
    return () => {
      dispatch(modalActions.CloseCalendar());
      dispatch(modalActions.CloseComment());
      dispatch(modalActions.CloseMarket());
      dispatch(modalActions.CloseUserSearch());
    };
  }, []);
};
