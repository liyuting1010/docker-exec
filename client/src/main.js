import Vue from 'vue'
import App from './App.vue'
import Element from 'element-ui';
import 'element-ui/lib/theme-chalk/index.css';
import './theme/index.css';

import store from './store';

Vue.use(Element, { size: 'small', zIndex: 3000 });

Vue.config.productionTip = false

new Vue({
  render: h => h(App),
  store
}).$mount('#app')
