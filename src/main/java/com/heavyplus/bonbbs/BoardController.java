package com.heavyplus.bonbbs;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.heavyplus.dto.BoardDTO;
import com.heavyplus.dto.PageDTO;
import com.heavyplus.service.BoardService;
import com.heavyplus.service.CategoryService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/board")
public class BoardController {

	private final BoardService boardService;
	private final CategoryService categoryService;

	@GetMapping()
	public String getBoardListView(PageDTO<BoardDTO> boardPage, Model model) throws Exception {
		model.addAttribute("pageInfo", boardService.listAll(boardPage));
	    model.addAttribute("boardList", boardPage.getContentList());
//	    System.out.println(model);
		return "board/getBoardList";
	}

	@GetMapping("/{documentId}")
	public String getBoardView(
		@PathVariable("documentId") Long documentId, 
		Model model
	) throws Exception {
		model.addAttribute("board", boardService.read(documentId));
		return "board/getBoard";
	}

	@GetMapping(params = "act=write")
	public String getInsertBoardView(
		@RequestParam(value="documentId", required=false) Long documentId,
		Model model
	) throws Exception {
		model.addAttribute("board", documentId == null ? new BoardDTO() : boardService.read(documentId));
		model.addAttribute("categoryList", categoryService.listAll());
		return "board/insertBoard";
	}

	@PostMapping()
	public String insertBoard(BoardDTO board) throws Exception {
		boardService.regist(board);
		return "redirect:/board/" + board.getDocumentId(); //TODO
	}

	@PatchMapping(params = "documentId")
    public String updateBoard(BoardDTO board) throws Exception {
        boardService.modify(board);
        return "redirect:/board/" + board.getDocumentId(); //TODO
    }

	@DeleteMapping(params = "documentId")
    public String deleteBoard(
    @RequestParam("documentId") Long documentId) throws Exception {
        boardService.remove(documentId);
        return "redirect:/board";
   }

}