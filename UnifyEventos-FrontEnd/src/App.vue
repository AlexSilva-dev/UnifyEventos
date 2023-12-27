<script setup>
import { RouterLink, RouterView } from 'vue-router'
import HelloWorld from './components/HelloWorld.vue'
import TheNavBar from './components/TheNavBar.vue';
</script>

<template>

  <header>
    <div class="wrapper">
      <TheNavBar/>
    </div>
  </header>

  <div class="row">

    <div class="col">
    </div>

    <RouterView class="col-7"/>

    <div class="col">
    </div>

  </div>

</template>

<style scoped>
header {
  margin-bottom: 90px;
}


</style>
