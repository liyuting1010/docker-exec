import Vue from 'vue';
import Vuex from 'vuex';
import axios from 'axios';

Vue.use(Vuex);

export default new Vuex.Store({
    state: {
        users: [],
    },
    mutations: {
        setUsers(state, value) {
            state.users = value;
        }
    },
    actions: {
        async fetchUsers({ commit }) {
            await axios.get('http://localhost:8080/getAll').then(response => {
                console.log(response.data);
                commit('setUsers', response.data);
            });
        },
    },
});
