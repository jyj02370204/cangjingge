package cn.edu.bit.cangjingge.fiction.controller;

import cn.edu.bit.cangjingge.common.entity.FictionChapter;
import cn.edu.bit.cangjingge.common.response.Response;
import org.apache.commons.lang.NotImplementedException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FictionChapterController {

    /**
     * 使用小说的ID以及章节的ID获取章节
     * @return 小说章节
     */
    @GetMapping("/{fictionId}/chapters/{chapterId}")
    public Response<FictionChapter> getChapter(
            @PathVariable("fictionId") final Long fictionId,
            @PathVariable("chapterId") final Long chapterId
    ) {
        throw new NotImplementedException();
    }

    /**
     * 更新小说章节的标题，内容
     * @return 更新后的章节
     */
    @PutMapping("/{fictionId}/chapters/{chapterId}")
    public Response<FictionChapter> updateChapter(
            @PathVariable("fictionId") final Long fictionId,
            @PathVariable("chapterId") final Long chapterId,
            final String title,
            final String content
    ) {
        throw new NotImplementedException();
    }

    /**
     * 获取小说的所有章节
     */
    @GetMapping("/{fictionId}/chapters")
    public Response<List<FictionChapter>> getChapterList(
            @PathVariable("fictionId") final Long fictionId
    ) {
        throw new NotImplementedException();
    }

    /**
     * 为小说ID创建小说章节
     * @return 创建的章节
     */
    @PostMapping("/{fictionId}/chapters")
    public Response<FictionChapter> createChapter(
            @PathVariable("fictionId") final Long fictionId,
            final String content
    ) {
        throw new NotImplementedException();
    }

}
