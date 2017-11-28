package team.javaMusicPlayer.CenterGUI;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MusicListInformation extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static String musicListName = "这是歌单";
	private static String createTime = "2016-11-11";
	private static String creator = "创建者";
	private static String imageRounte = "C:/Users/77438/Pictures/Saved Pictures/下载.jpg";
	public static void setMusicListName(String musicListName) {
		MusicListInformation.musicListName = musicListName;
	}
	public static void setCreateTime(String createTime) {
		MusicListInformation.createTime = createTime;
	}
	public static void setCreator(String creator) {
		MusicListInformation.creator = creator;
	}
	public static void setImageRounte(String imageRounte) {
		MusicListInformation.imageRounte = imageRounte;
	}
	public MusicListInformation() {
		// TODO Auto-generated constructor stub
		this.setLayout(new FlowLayout(FlowLayout.LEFT));
		this.setPreferredSize(new Dimension(735, 300));

		ImageIcon images = new ImageIcon(imageRounte);
		int height = 0, width = 200;
		height = width * images.getIconHeight()/ images.getIconWidth();
		images.setImage(images.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT));
		JLabel lbMusicShow = new JLabel(images);
		lbMusicShow.setPreferredSize(new Dimension(width, height));
		
		JPanel informationAndOperation = new JPanel();
		informationAndOperation.setLayout(new BoxLayout(informationAndOperation, BoxLayout.Y_AXIS));
		
		JPanel listName = new JPanel();
		listName.setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel lblistName = new JLabel(musicListName);
		listName.add(lblistName);
		
		JPanel creatorAndTime = new JPanel();
		creatorAndTime.setLayout(new FlowLayout(5));
		JLabel lbCreatorName = new JLabel(creator);
		JLabel lbCreateTime = new JLabel(createTime);
		creatorAndTime.add(lbCreatorName);
		creatorAndTime.add(lbCreateTime);
		
		JPanel playAndDownLoad = new JPanel();
		playAndDownLoad.setLayout(new FlowLayout(5));
		JButton btnPlay = new JButton("播放全部");
		btnPlay.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		JButton btnDownLoad = new JButton("下载全部");
		btnDownLoad.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		playAndDownLoad.add(btnPlay);
		playAndDownLoad.add(btnDownLoad);
		
		informationAndOperation.add(listName);
		informationAndOperation.add(creatorAndTime);
		informationAndOperation.add(playAndDownLoad);
		
		this.add(lbMusicShow);
		this.add(informationAndOperation);
	}

}
