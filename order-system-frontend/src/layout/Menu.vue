<template>
    <el-menu
            background-color="#304156"
            default-active="1"
            class="el-menu-vertical-demo"
    >
        <el-menu-item index="1">
            <el-icon>
                <TrendCharts/>
            </el-icon>
            <template #title>数据总览</template>
        </el-menu-item>
        <el-menu-item index="2">
            <el-icon>
                <User/>
            </el-icon>
            <template #title>用户管理</template>
        </el-menu-item>
        <el-menu-item index="3">
            <el-icon>
                <Goods/>
            </el-icon>
            <template #title>商品管理</template>
        </el-menu-item>
        <el-menu-item index="4">
            <el-icon>
                <Menu/>
            </el-icon>
            <template #title>信息管理</template>
        </el-menu-item>
    </el-menu>
</template>

<script setup lang="ts">

</script>

<style lang="scss">
.el-menu-vertical-demo:not(.el-menu--collapse) {
    width: 200px;
    min-height: 400px;
}

.el-menu {
    border-right: none;
}

.el-menu .el-menu-item {
    color: #bac5cf;
    font-size: 15px;
    font-weight: bold;
}

.el-menu-item .is-active {
    color: #409eff !important;
    background-color: #1f2d3d !important;
}

// 鼠标移动过的时候
:deep(.el-menu-item:hover) {
    background-color: #001528 !important;
}
</style>