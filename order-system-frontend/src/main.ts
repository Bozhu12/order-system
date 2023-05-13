import { createApp } from 'vue'
import './style.css'
import App from './App.vue'
import router from "./router";
import ElementPlus from 'element-plus'
import 'element-plus/dist/index.css'
import * as ElementPlusIconsVue from '@element-plus/icons-vue'
import {createPinia} from "pinia";

const app = createApp(App)

app.use(router)

const pinia = createPinia()
app.use(pinia)

app.use(ElementPlus)
// 图标全部注册
for (const [key, component] of Object.entries(ElementPlusIconsVue)) {
    app.component(key, component)
}

app.mount('#app')
