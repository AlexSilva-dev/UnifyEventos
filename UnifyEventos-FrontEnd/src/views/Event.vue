<script setup>
import Banner from '../components/event/Banner.vue'

</script>

<template>
  <main class="container">
    
    <Banner>
    </Banner>

    <div class="row mb-5">
        kk
    </div>
  </main>
</template>

<script>

    export default {
      mounted() {
        console.log('jflashfldfj')
          console.log('oii', this.$emit('shouldShowNav', false), { broadcast: true });
      }
    }
</script>

<style>
  main {
    min-width: min-content;
  }
</style>