interface httpStatusCodeType {
  OK: number;
  CREATE: number;
  NOCONTENT: number;
  UNAUTHORIZED: number;
  FORBIDDEN: number;
  NOTFOUND: number;
}

export const httpStatusCode: httpStatusCodeType = {
  OK: 200,
  CREATE: 201,
  NOCONTENT: 204,
  UNAUTHORIZED: 401,
  FORBIDDEN: 403,
  NOTFOUND: 404,
};
