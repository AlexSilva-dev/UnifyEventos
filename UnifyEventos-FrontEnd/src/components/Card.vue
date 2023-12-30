<template>

  <div class="container card">

    <div class="row">

      <div class="d-flex flex-row">

        <div class="me-3">
          <a href="#">
            <img class="img-thumbnail thumbnail-nav rounded-5"
            src="../assets/logo.svg" alt="">
          </a>
        </div>

        <div >
          <a href="#" class="row margin-bottom-sm fw-semibold p-0">nome do usuário</a>
          <span class="row m-sm">Breve descrição do usuário</span>
        </div>

      </div>

    </div>

    <div class="row">
      <img
      class="img-fluid"
      src="https://d1csarkz8obe9u.cloudfront.net/posterpreviews/comedy-stand-up-night-show-add-event-template-design-a0ebff8c222627c792d2c6c7603e6a7d_screen.jpg?ts=1685750433"
      alt="evento">
    </div>

    <div class="row px-2 justify-content-center">

      <div id="information-card" class="row my-2 mb-4 fw-bolder">

        <div class="col-12 col-md-6 mx-auto text-center">
          Data: <span>01/11/2024</span> <span>16H</span>
        </div>
        <div class="col-12 col-sm-12 col-md-6 mx-auto text-center">
          Local: <span>Centro do Rio de Janeiro</span>
        </div>

      </div>


      <div class="row">
        <h2 class="h4 text-center">
          Show de Comédia com [nome do comediante]
        </h2>
        <p class="text-truncate text-wrap" style="max-height: 15vh;">
          Prepare-se para rir até cair da cadeira com o show de comédia do [nome do comediante]. Com seu humor inteligente e mordaz, [nome do comediante] vai levar você a uma viagem de risadas inesquecível.
          [Nome do comediante] é um comediante veterano com mais de [número] anos de experiência. Ele já se apresentou em todo o Brasil e é conhecido por seu humor inteligente e perspicaz. Seus shows são sempre cheios de energia e diversão, e ele sempre consegue arrancar risadas do público, mesmo dos mais exigentes.
          No seu novo show, [nome do comediante] vai falar sobre tudo, desde política até relacionamentos. Ele vai te fazer rir de si mesmo e do mundo ao seu redor.

          Não perca essa oportunidade de ver um dos comediantes mais engraçados do Brasil ao vivo. Garanta já seu ingresso!

        </p>

      </div>
      <div id="card-footer" class="row">

        <div class="col text-start">
          R$: <span id="card-price" class="fw-bold">10</span>
        </div>
        <div class="col-5 col-sm text-center">
          <a class="btn btn-info rounded-3" :class="[{'btn-sm': !screenSm}]">
            <RouterLink to="/event">
              Ver mais
              <i class="bi bi-chevron-double-right"></i>

            </RouterLink>
          </a>
        </div>

        <div class="col text-end">
          <img class="img-thumbnail rounded-5 age-range"
          src="https://previews.123rf.com/images/ascom73/ascom732106/ascom73210600009/169916240-16-plus-icon-vector-under-sixteen-years-prohibition-sign-adults-only-for-your-web-design-logo.jpg"
          alt="faixa etária">
        </div>

      </div>
    </div>

  </div>

</template>

<script>
import { RouterLink } from 'vue-router';

  export default {
    data() {
        return {
            windowWidth: window.innerHeight,
            screenSm: false
        };
    },
    mounted() {
        window.addEventListener('resize', () => {
            this.windowWidth = window.innerWidth;
        });
    },
    watch: {
        windowWidth() {
            this.screenSm = this.windowWidth > 576;
            console.log(this.screenSm, this.windowWidth);
        }
    },
    components: { RouterLink }
};
</script>

<style scoped>

p {
  font-size: 20px;
}

#information-card {
  color: gainsboro;
  font-size: 18px;

}
#card-price {
  font-size: 28px;
  color: lightgrey;
}
#card-footer {
}
.age-range {
  width: 50px;
  height: 50px;
  margin-right: -20px;
}

.card {
  min-width: 300px;
  border: 1px solid rgba(0, 0, 0, 0.802);
  border-radius: 20px;
  padding: 1vw;

  background-color: rgba(0, 0, 0, 0.685);
  backdrop-filter: blur(4px);
  -webkit-backdrop-filter: blur(3px);

  color: white;
}

@media (max-width: 800px) {
  p {
    font-size: 16px;
  }
  #information-card {
    font-size: 16px;
  }
}
</style>
