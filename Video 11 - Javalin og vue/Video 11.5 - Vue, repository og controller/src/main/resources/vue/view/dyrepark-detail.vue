<template id="dyrepark">
  <ul>
    <li v-for="dyr in dyreListe">
      <h1>{{dyr.id + " - " + dyr.navn}}</h1>
    </li>
  </ul>
</template>
<script>
  Vue.component("dyrepark-detail", {
    template: "#dyrepark",
    data: () => ({
      dyreListe: [],
    }),
    created() {
      const parkNavnParam = this.$javalin.pathParams["dyrepark-id"];

      fetch (`/api/dyrepark/${parkNavnParam}`)
        .then(res => res.json())
        .then(res => {
          this.dyreListe = res
        })
      .catch(() => alert("Kunne ikke hente dyr i dyreparken"))
    }
  });
</script>
<style>
</style>