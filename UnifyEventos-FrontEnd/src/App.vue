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

  <div class="container">

    <div class="row justify-content-center">
      <div class="col d-sm-none d-none">
        </div>

        <RouterView class="col-11 col-md-8"/>

        <div class="col d-sm-none d-none">
        </div>

      </div>
    </div>

</template>


<style scoped>


</style>
