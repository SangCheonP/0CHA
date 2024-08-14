import { localAxios } from '../../util/axios-setting';
import { FitnessType } from '../../util/types/axios-fitness';

const jwt = localAxios();

export const fetchFitnessList = async (): Promise<FitnessType[]> => {
  const response = await jwt.get('/workout/exercises');
  return response.data;
};

export const fetchFitnessJjimList = async (): Promise<FitnessType[]> => {
  const response = await jwt.get('/workout/exercises/favorites');
  return response.data;
};
