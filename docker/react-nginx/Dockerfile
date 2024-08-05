# Stage 1: Build React app
FROM node:14 AS builder
WORKDIR /app
COPY ../front-end/package*.json ./
COPY ../front-end/tsconfig.json ./
RUN npm install
COPY ../front-end ./
RUN npm run build

# Stage 2: Serve React app with Nginx
FROM nginx:alpine
COPY --from=builder /app/build /usr/share/nginx/html
COPY ./react-nginx/nginx.conf /etc/nginx/nginx.conf

EXPOSE 80
CMD ["nginx", "-g", "daemon off;"]

