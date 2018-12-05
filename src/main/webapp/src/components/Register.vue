<template>
  <b-card id="login" title="Registration">
    <b-form @submit.prevent="onSubmit">
      <b-form-group label="Username">
        <b-form-input v-model="username" required type="text"></b-form-input>
      </b-form-group>
      <b-form-group label="Password">
        <b-form-input v-model="password" required type="password"></b-form-input>
      </b-form-group>
      <b-form-group label="repeat Password">
        <b-form-input v-model="passwordRepeat" required type="password"></b-form-input>
      </b-form-group>
      <b-form-group>
        <b-button type="submit" variant="primary">Register</b-button>
      </b-form-group>
    </b-form>
    <a href="#" @click.prevent="changeToLogin">Login</a>
  </b-card>
</template>

<script>
export default {
  name: "Register",
  props: ["changeToLogin", "handleRegister"],

  data() {
    return {
      username: "",
      password: "",
      passwordRepeat: ""
    };
  },

  methods: {
    onSubmit() {
      if (this.password !== this.passwordRepeat) return;
      this.handleRegister({
        password: this.password,
        username: this.username
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
