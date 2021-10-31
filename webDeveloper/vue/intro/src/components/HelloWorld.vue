<template>
  <div >
   <h1 class="alert alert-danger">{{msg}}</h1>
  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  props: {
    msg: String
  }
}
</script>


<style scoped>

</style>
