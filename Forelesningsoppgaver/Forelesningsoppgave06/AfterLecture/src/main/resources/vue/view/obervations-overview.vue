<template id="observations-overview">
  <div>
    <h1>Observations</h1>
    <ul class="observations-overview-list">
      <li v-for="observation in observations">
        <a :href="`/observations/${observation.id}`" class="link-to-observation-details">
          <div class="single-observation-container" >
            <h1>{{observation.id}} - {{observation.name}}</h1>
            <h1>{{observation.observedAnimal.name}}</h1>
          </div>
        </a>
      </li>
    </ul>
  </div>
</template>
<script>
Vue.component("observations-overview", {
  template: "#observations-overview",
  data: () => ({
    observations: [],
  }),
  created() {
    fetch("/api/observations")
        .then(res => res.json())
        .then(res => {
          this.observations = res;
        })
        .catch(() => alert("Error while fetching observations"));
  }
});
</script>
<style>
li{
  list-style-type: none;
}

h1{
  text-align: center;
}

.observation-overview-list{
  display: flex;
  flex-wrap: wrap;
  justify-content: center;
}

.observation-overview-list li{
  padding: 10px;
  border: 1px solid white;
  border-radius: 15px;
}

.link-to-observation-details{
  width: 400px;
  height:100px;
  text-decoration: none;
  color: white;
}

div.single-observation-container{
  overflow: hidden;
  width: 500px;
  background-color: #000000;
  margin: 0 auto;
  opacity: 0.96;
  text-align: center;
}

div.single-observation-container:hover{
  opacity: 1.0;
  overflow: hidden;
  -webkit-box-shadow: 10px 10px 5px 0px rgba(0,0,0,0.25);
  -moz-box-shadow: 10px 10px 5px 0px rgba(0,0,0,0.25);
  box-shadow: 10px 10px 5px 0px rgba(0,0,0,0.25);
}

img.cover-image-frontpage {
  height: auto;
  width: 100%;
  padding-bottom: 20px;
  max-height: 280px;
}

</style>