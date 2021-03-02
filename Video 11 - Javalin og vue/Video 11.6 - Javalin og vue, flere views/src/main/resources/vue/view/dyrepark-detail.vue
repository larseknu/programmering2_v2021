<template id="dyrepark">
  <div>
    <h1 v-if="dyrePark">Dyrene i {{dyrePark.navn}}</h1>
    <ul>
      <li v-for="dyr in dyrePark.dyrIDyreParken">
        <a v-if="dyrePark" :href="`/dyrepark/${dyrePark.navn}/dyr/${dyr.id}`">
          <h2>{{dyr.id + " - " + dyr.art + " " + dyr.navn}}</h2>
        </a>
      </li>
    </ul>
  </div>
</template>
<script>
  Vue.component("dyrepark-detail", {
    template: "#dyrepark",
    data: () => ({
      dyrePark: null,
    }),
    created() {
      const parkNavnParam = this.$javalin.pathParams["dyrepark-id"];

      fetch (`/api/dyrepark/${parkNavnParam}`)
        .then(res => res.json())
        .then(res => {
          this.dyrePark = res
        })
      .catch(() => alert("Kunne ikke hente dyr i dyreparken"))
    }
  });
</script>
<style>
</style>