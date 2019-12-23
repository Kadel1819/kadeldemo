package com.kuwo.lmusic.mapper;



import com.kuwo.lmusic.entity.Song;
/**
 * 处理歌曲数据增查删改的持久层接口
 * @author 李钦鹏
 *
 */
public interface SongMapper {
	/**
	 * 添加歌曲
	 * @param song 歌曲数据
	 * @return 执行条数
	 */
	Integer insertSong(Song song);
	/**
	 * 查询这首歌歌手是否已经上传
	 * @param songName 歌曲名
	 * @param aid	专辑
	 * @return
	 */
	Song findByName(String songName,Integer aid);
}


