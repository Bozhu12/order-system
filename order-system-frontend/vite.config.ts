import {defineConfig} from 'vite'
import vue from '@vitejs/plugin-vue'
import {resolve} from 'path'

// https://vitejs.dev/config/
export default defineConfig({
    plugins: [
        vue(),
    ],
    server: {
        host: '0.0.0.0', // 控制台
        port: 8080, // 端口
        hmr: true,  // 热更新
        open: false,  // 自动浏览器
        proxy: {
            '/api': {
                target: 'http://localhost:8089',
                changeOrigin: true,
                rewrite: (path) => path.replace(/^\/api/, '')
            }
        }
    },
    resolve: {
        alias: {
            // find: '@',
            // replacement: resolve(__dirname, 'src')
            '@': resolve(__dirname, 'src')
        }
    },
    define: {
        'process.env': {
            // 'BASE_API': "http://192.168.31.70:8089"
            'BASE_API':"http://localhost:8089"
        }
    }
})
