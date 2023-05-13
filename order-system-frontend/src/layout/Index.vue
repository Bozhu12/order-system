<template>
    <el-container class="common-layout">
        <el-aside width="auto" class="asside"><Menu/></el-aside>
        <el-container>
            <el-header class="header">Header</el-header>
            <el-main class="main">Main</el-main>
        </el-container>
    </el-container>
</template>

<script setup lang="ts">

import Menu from "@/layout/Menu.vue";
</script>

<style lang="scss">
.common-layout {
    height: 100%;

    .asside {
        //background-color: blueviolet;
        background-color: #304156;
    }

    .header {
        background-color: chocolate;
    }

    .main {
        background-color: darkcyan;
    }
}
</style>