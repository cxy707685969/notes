<template>
  <div>
    <el-form class="department-management-from" ref="form" :model="form" label-width="140px">
      <el-form-item label="departmentCode">
        <el-input v-model="departmentCode"></el-input>
      </el-form-item>
      <el-form-item label="description">
        <el-input v-model="description"></el-input>
      </el-form-item>
      <el-form-item>
        <el-button type="primary" @click="onSearch">Search</el-button>
        <el-button @click="onReset">Reset</el-button>
      </el-form-item>
    </el-form>
  </div>
</template>

<script>
export default {
  name: 'DepartmentManagementForm',
  data () {
    return {
      departmentCode: '',
      description: '',
    };
  },
  methods: {
    onSearch () {

    },
    onReset () {
      this.departmentCode = '';
      this.description = '';
    }
  },
};
</script>

<style lang="scss" scoped>
  .department-management-from {
    width: 40%;
    margin: 0 auto;
  }
</style>
