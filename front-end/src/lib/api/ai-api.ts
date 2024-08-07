import { localAxios, publicAxios } from '../../util/axios-setting';

const local = publicAxios();
const jwt = localAxios();
