<template>
    <div>
        <h2>TodoView</h2>
        <input type="checkbox" v-model="todo.isDone"><span>{{ todo.content }}</span>
    </div>
</template>

<script setup>
defineProps(
    {todo : Object}
)

</script>

<style scoped>

</style>