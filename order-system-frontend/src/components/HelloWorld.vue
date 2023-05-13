<script setup lang="ts">
import {ref} from 'vue'

const msg = ref('kjlkwsrjl')
</script>

<template>
    <h1>{{ msg }}</h1>
    <el-row class="mb-4">
        <el-button>Default</el-button>
        <el-button type="primary">Primary</el-button>
        <el-button type="success">Success</el-button>
        <el-button type="info">Info</el-button>
        <el-button type="warning">Warning</el-button>
        <el-button type="danger">Danger</el-button>
    </el-row>

    <el-icon>
        <Edit/>
    </el-icon>

</template>

<style scoped>
</style>
