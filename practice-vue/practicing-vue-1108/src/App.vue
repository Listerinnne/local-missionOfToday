<template>
  <div>
    <HeadView/>
  </div>
    <div>
      <nav>
        <RouterLink to="/">Home</RouterLink> | 
        <RouterLink to="/todo">todo</RouterLink>
      </nav>
    </div>

  <RouterView />
</template>

<script setup>
import { RouterLink, RouterView } from 'vue-router';
import HeadView from './views/HeadView.vue';
</script>

<style scoped>
</style>
