<template>
    <div>
        <div class="banner rounded-bottom-5
        justify-content-center text-center readable-blur"
        :style="styleBanner">
        <div class="d-inline rounded-4">
                <img id="banner-img"
                class="img-fluid"
                src="https://d1csarkz8obe9u.cloudfront.net/posterpreviews/comedy-stand-up-night-show-add-event-template-design-a0ebff8c222627c792d2c6c7603e6a7d_screen.jpg?ts=1685750433"
                alt="evento">
            </div>

        </div>
        <div id="banner-background" class="banner rounded-bottom-5
        justify-content-center text-center"
        :style="styleBanner">
        </div>
    </div>
</template>

<script lang="js">
    export default {
        
    data() {
        return {
            windowWidth: 0,
            screenSm: false,
            
        };
    },
    mounted() {
        window.addEventListener('resize', () => {
            this.windowWidth = window.innerWidth;
            console.log('janela mudou', this.windowWidth)

        });
    },
    watch: {
        windowWidth() {
            this.screenSm = this.windowWidth > 576;
            console.log(this.screenSm, this.windowWidth);
        }
    },

    computed: {
        styleBanner() {
            return {
                width: (this.windowWidth-15) + 'px'
            }
        }
    }
    }
</script>

<style lang="css">
    #banner-img {
        width: 80%;
        border-radius: 15px;
    }
    .banner {
        background-color:rgba(0, 0, 0, 0.135);
        height: 45vw;
        position: relative;
        z-index: 222;
    }
    #banner-background {
        background-image: url("https://d1csarkz8obe9u.cloudfront.net/posterpreviews/comedy-stand-up-night-show-add-event-template-design-a0ebff8c222627c792d2c6c7603e6a7d_screen.jpg?ts=1685750433");
        background-repeat: initial;
        position: absolute;
        z-index: 0;
        top: 0;
    }

    #banner-background-img {
        position: initial;
        width: 100%;
        height: 100%;
        margin-top: 20px;
    }
    .readable-blur {

        backdrop-filter: blur(20px);
        -webkit-backdrop-filter: blur(40px);
    }
</style>