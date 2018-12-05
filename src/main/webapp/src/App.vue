<template>
  <div>
    <Login v-if="state === 0" :changeToRegister="() => state = 1" :handleLogin="handleLogin"/>
    <Register v-if="state === 1" :changeToLogin="() => state = 0" :handleRegister="handleRegister"/>
  </div>
</template>

<script>
import Login from "./components/Login.vue";
import Register from "./components/Register.vue";

export default {
  name: "app",
  data() {
    return {
      state: 0
    };
  },
  components: {
    Login,
    Register
  },
  methods: {
    handleRegister(userPassword) {
      console.log(userPassword);
    },
    handleLogin(userPassword) {
      console.log(userPassword);
    }
  }
};
</script>

<style>
#app {
  font-family: "Avenir", Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
body {
  background-image: url("assets/background.jpg");
  background-size: 100px;
}
</style>
