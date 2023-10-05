const http = require('http');
const httpProxy = require('http-proxy');

const target = 'http://localhost:8080/legalfirm'; // The target API URL
const proxy = httpProxy.createProxyServer({});

const server = http.createServer((req, res) => {
  // Set CORS headers here if needed
  proxy.web(req, res, { target });
});

server.listen(3000, () => {
  console.log('Proxy server listening on port 3000');
});