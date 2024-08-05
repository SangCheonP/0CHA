import { AxiosResponse } from 'axios';
import { localAxios } from '../../util/axios-setting';

const local = localAxios();

export const login = async (param, success, fail) => {
  console.log(param);
  await local.post(`/auth/login/`, param).then(success).then(fail);
};
