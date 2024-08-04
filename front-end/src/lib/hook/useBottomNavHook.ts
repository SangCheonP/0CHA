import React, { useEffect } from 'react';
import { useAppDispatch, useAppSelector } from './useReduxHook';
import { navActions, selectNav } from '../../store/nav';

export const useBottomNavHook = (mode: string): void => {
  const dispatch = useAppDispatch();
  useEffect(() => {
    dispatch(navActions.change(mode));
  }, []);
};
