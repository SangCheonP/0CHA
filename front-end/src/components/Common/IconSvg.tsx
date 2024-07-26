import React from 'react';

type IconSvgProps = {
  Ico: React.FunctionComponent<React.SVGProps<SVGSVGElement>>;
  width: string;
  height: string;
  color: string;
};

const IconSvg: React.FC<IconSvgProps> = ({ Ico, width, height, color }) => {
  return <Ico width={width} height={height} fill={color} />;
};

export default IconSvg;
