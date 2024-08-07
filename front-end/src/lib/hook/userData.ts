export const userData = () => {
  const datas = localStorage.getItem('user');
  if (!datas) {
    throw new Error('No saved todos');
  }
  const data = JSON.parse(datas);

  return data;
};
