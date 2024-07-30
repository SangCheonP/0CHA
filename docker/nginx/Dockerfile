# Nginx Official Image
FROM nginx:latest

# Copy Config File
COPY nginx.conf /etc/nginx/nginx.conf

# Expose Port
EXPOSE 80

# Start Nginx
CMD ["nginx", "-g", "deamon off;"]
