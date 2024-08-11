export interface snsFeedWrite {
  content: String;
  image: string;
  routineId: number;
}

export interface snsItemWrite {
  title: string;
  price: number;
  content: string;
  images: string[];
}

export interface snsItemList {
  userId: number;
  page: number;
  limit: number;
  district: string;
  siGunGu: string;
  title: string;
}
