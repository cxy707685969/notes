<template>
  <div :class='formStyle'>
    <el-row class='search-form'>
      <el-row class='search-form-item' :gutter='20'>
        <el-col class='search-l' :span='7'><span class='search-label'>Department Code:</span><span class='star'>*</span></el-col>
        <el-col :span='13'><el-input size='mini' v-model='form.departmentCode' @input='handleDepartmentCodeChanged'></el-input></el-col>
      </el-row>
      <el-row class='search-form-item' :gutter='20'>
        <el-col class='search-l' :span='7'><span class='search-label'>Description:</span><span class='star'>*</span></el-col>
        <el-col :span='13'><el-input size='mini' v-model='form.description' @input='handleDescriptionChanged'></el-input></el-col>
      </el-row>
    </el-row>
  </div>
</template>

<script>
export default {
  name: 'DepartmentManagementForm',
  props: {
    formStyle: String,
    formData: Object,
  },
  data () {
    return {
      form: this.formData,
    };
  },
  methods: {
    handleDepartmentCodeChanged () {
      this.$emit('handleDepartmentCodeChanged', this.form.departmentCode);
    },
    handleDescriptionChanged () {
      this.$emit('handleDescriptionChanged', this.form.description);
    },
  },
};
</script>

<style lang="scss" scoped>
.department-management-from {
  margin-top: 10px;
  font-size: 12px;
  width: 30%;
  .search-form {
    margin-bottom: 20px;
    .search-form-item {
      margin-top: 10px;
      .search-l {
        text-align: left;
        margin-left: 10px;
        .search-label {
          line-height: 28px;
          font-weight: 600;
          color: #606266;
        }
      }
    }
    .item-top {
      margin-top: 20px;
    }
  }
}
.size-max {
  width: 100%;
  .search-form {
    .search-form-item {
      .search-l {
        .search-label {
          font-weight: 500;
        }
      }
    }
  }
}
</style>
