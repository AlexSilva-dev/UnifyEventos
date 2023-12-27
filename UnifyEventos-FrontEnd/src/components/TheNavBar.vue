<script setup>

</script>

<template>
  <nav id="navbar" class="navbar navbar-expand-sm
  fixed-top rounded-4 m-1"
  data-bs-theme="dark">
    <div class="container-fluid">
      <RouterLink class="navbar-brand" to="/">
        <img src="../assets/logo.svg"
        alt="Logo" width="30" height="24"
        class="d-inline-block align-text-top">
        UnifyEventos
      </RouterLink>

      <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <div class="col">

          <ul class="navbar-nav me-auto mb-2 mb-lg-0">
            <li class="nav-item">
              <RouterLink class="nav-link" to="/home">Eventos</RouterLink>
            </li>

            <li class="nav-item dropdown">
              <RouterLink class="nav-link text-nowrap" to="/home">
                Sobre nós
              </RouterLink>
            </li>
          </ul>

        </div>
       
        <div class="col col-3">
          <form class="d-flex" role="search">
          <input class="form-control me-2" type="search" placeholder="Buscar" aria-label="Search">
          <button class="btn btn-outline-success" type="submit">
            <i class="bi bi-search"></i>
          </button>
        </form>
        </div>

       <div class="col text-end">
        <button class="btn btn-light me-2">Divulge aqui</button>
        <a href="#">
          <img src="../assets/logo.svg"
            class="img-thumbnail thumbnail-nav rounded-5"
            alt="">
        </a>

       </div>
      </div>
    </div>
  </nav>
</template>

<style scoped>



</style>
