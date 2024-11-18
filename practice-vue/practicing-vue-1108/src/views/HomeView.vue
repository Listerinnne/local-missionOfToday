<template>
    <div>
        <h2>Todo Home</h2>
        <form @submit.prevent="registTodo">
            <input type="text" v-model="todo" placeholder="할일을 하자">
            <button type="submit">등록</button>
        </form>
        <ul v-for="singleTodo in todos" :key="singleTodo.date">
            <TodoView
            :todo="singleTodo"
            />
        </ul>
        
</div>
</template>

<script setup>
    import TodoView from './TodoView.vue'
    import {ref} from 'vue'

    const todo =  ref("")
    const todos = ref([])
    const registTodo = ()=>{
        console.log(todo.value)
        const tmp = todo.value.trim()
        if(tmp){
            todos.value.push({
                content : tmp,
                date : Date.now(),
                isDone : false
            })
        }
        todo.value = ""
    }
    

</script>

<style scoped>

</style>