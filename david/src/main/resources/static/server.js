const express = require('express');
const path = require('path');
const { createProxyMiddleware } = require('http-proxy-middleware');

const app = express();
const PORT = 3000;

// Serve static files
app.use(express.static(path.join(__dirname, './frontend')));

// Proxy API requests to Spring Boot
app.use('/api', createProxyMiddleware({
    target: 'http://localhost:8080',
    changeOrigin: true
}));

app.listen(PORT, () => {
    console.log(`Server is running on http://localhost:${PORT}`);
});