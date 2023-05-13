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
        open: false  // 自动浏览器
    },
    resolve: {
        alias: {
            // find: '@',
            // replacement: resolve(__dirname, 'src')
            '@': resolve(__dirname, 'src')
        }
    }
})
