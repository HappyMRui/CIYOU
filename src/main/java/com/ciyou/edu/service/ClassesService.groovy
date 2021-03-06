package com.ciyou.edu.service

import com.ciyou.edu.entity.Classes
import com.github.pagehelper.Page

/**
 * @Author C.
 * @Date 2018-02-10 9:22
 */
interface ClassesService {
    Page<Classes> findByPage(int pageNo, int pageSize)

    int addClasses(Integer gradeId, Integer classes)

    Classes getClasses(Integer classesId)

    int updateClasses(Integer classesId, Integer gradeId, Integer classes)

    int deleteClasses(Integer classesId)

    Page<Classes> queryClassesByPage(String value,int pageNo, int pageSize)

    List<Classes> getClassesByGrade(Integer gradeId)
}
