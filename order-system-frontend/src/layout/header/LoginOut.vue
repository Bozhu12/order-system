<template>
    <el-dropdown>
    <span class="el-dropdown-link">
      <img class="uimage" src='@/assets/user.jpg'/>
    </span>
    <template #dropdown>
      <el-dropdown-menu>
        <el-dropdown-item>退出登录</el-dropdown-item>
      </el-dropdown-menu>
    </template>
  </el-dropdown>
</template>

<script setup lang="ts">

</script>

<style scoped>
.uimage{
  height: 45px;
  width: 45px;
  border-radius: 50%;
  cursor: pointer;
}
</style>