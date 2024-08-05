import axios, { AxiosInstance } from 'axios';

export const localAxios = () => {
  const instance = axios.create({
    baseURL: '/api',
    withCredentials: true,
  });

  instance.defaults.headers.common['Authorization'] = '';
  instance.defaults.headers.post['Content-Type'] = 'application/json';
  instance.defaults.headers.patch['Content-Type'] = 'application/json';
  return instance;
};
