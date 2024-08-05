const { createProxyMiddleware } = require('http-proxy-middleware');

module.exports = function (app) {
  app.use(
    '/proxy',
    createProxyMiddleware({
      target: `${process.env.REACT_APP_BASE_URL}`,
      changeOrigin: true,
      // pathRewrite: {
      //   '^/proxy': '/api',
      // },
    }),
  );
};
