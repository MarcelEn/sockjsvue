<template>
  <b-card id="login" title="Login">
    <b-form @submit.prevent="onSubmit">
      <b-form-group label="Username">
        <b-form-input v-model="username" required type="text"></b-form-input>
      </b-form-group>
      <b-form-group label="Password">
        <b-form-input v-model="password" required type="password"></b-form-input>
      </b-form-group>
      <b-form-group>
        <b-button type="submit" variant="primary">Login</b-button>
      </b-form-group>
    </b-form>
    <a href="#" @click.prevent="changeToRegister">Register</a>
  </b-card>
</template>

<script>
export default {
  name: "Login",
  props: ["changeToRegister", "handleLogin"],

  data() {
    return {
      username: "",
      password: ""
    };
  },

  methods: {
    onSubmit() {
      this.handleLogin({
        username: this.username,
        password: this.password
      });
    }
  }
};
</script>

<style scoped>
#login {
  position: absolute;
  top: 50%;
  left: 50%;
  max-width: 250px;
  transform: translate(-50%, -50%);
}
</style>
