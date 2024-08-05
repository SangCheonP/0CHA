import axios, { Axios, AxiosRequestConfig } from 'axios';

export const localAxios = () => {
  const instance: Axios = axios.create({
    baseURL: '/proxy',
    withCredentials: true,
  });

  instance.defaults.headers.common['Authorization'] = '';
  instance.defaults.headers.post['Content-Type'] = 'application/json';
  instance.defaults.headers.patch['Content-Type'] = 'application/json';
  return instance;
};
