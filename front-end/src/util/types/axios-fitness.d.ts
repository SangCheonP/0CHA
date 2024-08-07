export interface newRoutine {
  name: string;
  dueDate: string;
}

export interface Routine {
  title: string;
  dueDate: string;
  exercises: exercise[];
}

type exercise = {
  id: number;
  name: string;
  detail: detail[];
};

type detail = {
  id: number;
  set: number;
  weight: number;
  count: number;
  isComplete: boolean;
};
