<template>
  <div id="app">
    <ProductAdd @add:product="addProduct" />
    <ProductList
      @delete:product="deleteProduct"
      @update:product="updateProduct"
      :products="products"
    />
  </div>
</template>

<script>
import ProductList from "./components/ProductList.vue";
import ProductAdd from "./components/ProductAdd.vue";
export default {
  name: "App",
  components: {
    ProductList,
    ProductAdd,
  },
  data() {
    return {
      products: [
        {
          id: 1,
          categoryId: 1,
          productName: "Laptop",
          quantityPerUnit: "Acer i5",
          unitPrice: 5000,
          unitsInStock: 2,
        },
        {
          id: 2,
          categoryId: 1,
          productName: "Mouse",
          quantityPerUnit: "Mouse i5",
          unitPrice: 5000,
          unitsInStock: 12,
        },
        {
          id: 3,
          categoryId: 2,
          productName: "Keyboard",
          quantityPerUnit: "Logitech keyboard",
          unitPrice: 5000,
          unitsInStock: 20,
        },
      ],
    };
  },
  methods: {
    deleteProduct(product) {
      this.products = this.products.filter(
        (productToFilter) => productToFilter.id !== product.id
      );
    },
    updateProduct() {},
    addProduct(product) {
      const newProduct = { ...product };
      this.products = [...this.products, newProduct];
    },
  },
};
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;

  color: #2c3e50;
  margin-top: 60px;
}
</style>
