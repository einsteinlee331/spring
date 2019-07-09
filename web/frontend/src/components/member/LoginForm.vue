<template>
<div>
  <Nav></Nav>
  <form>
    <div class="form-group">
      <label for="email">Email:</label>
      <input type="email" class="form-control" id="email" placeholder="Enter email">
    </div>
    <div class="form-group">
      <label for="pwd">Password:</label>
      <input type="password" class="form-control" id="pwd" placeholder="Enter password">
    </div>
    <div class="checkbox">
      <label><input type="checkbox"> Recommon me</label>
    </div>
    <button @click="get" class="btn btn-default">조  회</button>
    <button @click="post" class="btn btn-default">입  력</button>
    <button @click="put" class="btn btn-default">수  정</button>
    <button @click="del" class="btn btn-default">삭  제</button>
  </form>
  <Footer></Footer>
</div>
</template>

<script>
import Nav from '@/components/common/Nav.vue'
import Footer from'@/components/common/Footer.vue'
import axios from 'axios'

export default {
  components: {
    Nav,
    Footer
  }
,
  methods : {
    get(){
      alert('되냐')
      axios.get('/customers/count').then(res=>{
        alert(`SUCCESS : ${res.data.customerId}`)
      })
      .catch(e=>{
        alert('ERROR')
      })
    },
    post (){
      axios.post('/customers').then(res=>{
        alert(`post 연동성공: ${res.data.result}`)
      })

    },
    put(){
      axios.put('/customers/id').then(res=>{
        alert(`PUT 연동성공: ${res.data.result}`)
      })
    },
    del(){
      axios.delete('/customers/id').then(d=>{
        alert(`Del 연동성공 : ${res.data}`)
      })
    }





  }
}
</script>

<style scoped>
</style>