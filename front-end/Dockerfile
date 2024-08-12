# Build stage
FROM node:20 AS builder

WORKDIR /app
COPY . .

RUN npm i --legacy-peer-deps

RUN npm install -g serve

RUN npm run build

CMD ["serve", "-s", "build"]
