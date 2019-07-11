<template>
  <div>
    <el-table :data='table' border>
      <el-table-column header-align='center' prop='departmentCode' label='Department Code' width='180' sortable>
      </el-table-column>
      <el-table-column prop='description' header-align='center' label='Description'>
      </el-table-column>
      <el-table-column header-align='center' label='Action' width='180'>
        <template slot-scope='scope'>
          <el-button size='mini' class='save-button'>Edit</el-button>
          <el-button size='mini' class='save-button'>Delete</el-button>
        </template>
      </el-table-column>
    </el-table>
  </div>
</template>

<script>
export default {
  name: 'DepartmentManagementTable',
  props: {
    table: Array
  }
};
</script>
