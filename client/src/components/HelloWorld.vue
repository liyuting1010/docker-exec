<template>
  <div>
    <h1> YutingLI's Hello world application </h1>
    <el-table
            :data="getUsers"
            stripe
            style="width: 100%"
            class="users-table"
            height="78vh"
    >
      <el-table-column prop="name" label="user name"></el-table-column>
      <el-table-column prop="age" label="age"></el-table-column>
    </el-table>
  </div>
</template>

<script>
  import { mapActions, mapState } from 'vuex';

  export default {
    data() {
      return {
        hideLoadingIcon: false,
      };
    },
    mounted() {
      this.fetchUsers().finally(() => {
        this.hideLoadingIcon = true;
      });
    },
    computed: {
      ...mapState({
        getUsers(state) {
          return state.users;
        },
      }),
    },
    methods: {
      ...mapActions(['fetchUsers'])
    },
  };
</script>

<style lang="less" scoped>
  .hidden {
    display: none;
  }

  .el-icon-loading {
    font-size: 2rem;
    margin-top: 16px;
  }
</style>
